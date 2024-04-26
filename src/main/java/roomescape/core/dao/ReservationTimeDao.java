package roomescape.core.dao;

import java.util.List;
import java.util.Optional;
import roomescape.web.domain.ReservationTime;

public interface ReservationTimeDao {

    ReservationTime save(ReservationTime reservationTime);

    List<ReservationTime> findAllReservationTimes();

    Optional<ReservationTime> findById(Long id);

    void delete(Long id);
}
