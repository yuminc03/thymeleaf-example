// 예약 확정 상세 전용 JS: 단순 토글과 버튼 동작만 포함
(function () {
  const toggleBtn = document.getElementById("togglePatientMore");
  const more = document.getElementById("patientMore");
  const cancelBtn = document.getElementById("cancelReservation");

  if (toggleBtn && more) {
    toggleBtn.addEventListener("click", function () {
      const expanded = this.getAttribute("aria-expanded") === "true";
      this.setAttribute("aria-expanded", String(!expanded));
      more.hidden = expanded;
    });
  }

  if (cancelBtn) {
    cancelBtn.addEventListener("click", function () {
      // 데모용: 실제 취소 요청 대신 알림만 표시
      alert("예약 취소가 요청되었습니다. (데모)");
    });
  }
})();
