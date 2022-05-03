import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

  public static void main(String[] args) {

    ZoneId utcZoneId = ZoneId.of("Z");
    ZoneId polandZoneId = ZoneId.of("Poland");
    ZoneId mexicoGeneralZoneId = ZoneId.of("Mexico/General");

    // Poland
    // DST start - last Sunday in March at 1:00 UTC
    // DST end - last Sunday in October at 1:00 UTC

    ZonedDateTime marchBeforeDST = LocalDateTime.of(2022, 3, 1, 1, 0).atZone(utcZoneId);
    ZonedDateTime marchAfterDST = LocalDateTime.of(2022, 3, 30, 1, 0).atZone(utcZoneId);
    ZonedDateTime octoberBeforeDST = LocalDateTime.of(2022, 10, 20, 1, 0).atZone(utcZoneId);
    ZonedDateTime octoberAfterDST = LocalDateTime.of(2022, 10, 30, 1, 0).atZone(utcZoneId);

    System.out.println("#Poland UTC: " + marchBeforeDST + " ----- Local: " + marchBeforeDST.withZoneSameInstant(polandZoneId));
    System.out.println("#Poland UTC: " + marchAfterDST + " ----- Local: " +  marchAfterDST.withZoneSameInstant(polandZoneId));
    System.out.println("#Poland UTC: " + octoberBeforeDST + " ----- Local: " + octoberBeforeDST.withZoneSameInstant(polandZoneId));
    System.out.println("#Poland UTC: " + octoberAfterDST + " ----- Local: " + octoberAfterDST.withZoneSameInstant(polandZoneId));

    // Mexico
    // DST start - first Sunday in April at 2:00
    // DST end - last Sunday in October at 2:00

    ZonedDateTime aprilBeforeDST = LocalDateTime.of(2022, 4, 1, 2, 0).atZone(utcZoneId);
    ZonedDateTime aprilAfterDST = LocalDateTime.of(2022, 4, 10, 2, 0).atZone(utcZoneId);

    System.out.println();
    System.out.println("#Maxico UTC: " + aprilBeforeDST + " ----- Local: " + aprilBeforeDST.withZoneSameInstant(mexicoGeneralZoneId));
    System.out.println("#Maxico UTC: " + aprilAfterDST + " ----- Local: " + aprilAfterDST.withZoneSameInstant(mexicoGeneralZoneId));
    System.out.println("#Maxico UTC: " + octoberBeforeDST + " ----- Local: " + octoberBeforeDST.withZoneSameInstant(mexicoGeneralZoneId));
    System.out.println("#Maxico UTC: " + octoberAfterDST + " ----- Local: " + octoberAfterDST.withZoneSameInstant(mexicoGeneralZoneId));
  }
}
