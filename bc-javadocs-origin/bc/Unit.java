/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package bc;

public class Unit {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Unit(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Unit obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

//  protected void finalize() {
//    delete();
//  }
//
//  public synchronized void delete() {
//    if (swigCPtr != 0) {
//      if (swigCMemOwn) {
//        swigCMemOwn = false;
//        bcJNI.delete_Unit(swigCPtr);
//      }
//      swigCPtr = 0;
//    }
//  }

  /**
   * A single unit in the game and all its associated properties.
   */
  public Unit() {
    this(bcJNI.new_Unit(), true);
  }

  public String toString() {
    return bcJNI.Unit_toString(swigCPtr, this);
  }

  /**
   * Deep-copy a Unit.
   */
  public Unit clone() {
    long cPtr = bcJNI.Unit_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Unit(cPtr, true);
  }

  /**
   * Serialize a Unit to a JSON string
   */
  public String toJson() {
    return bcJNI.Unit_toJson(swigCPtr, this);
  }

  public boolean equals(Unit other) {
    return bcJNI.Unit_equals(swigCPtr, this, Unit.getCPtr(other), other);
  }

  /**
   * Returns the unique ID of a unit.
   */
  public int id() {
    return bcJNI.Unit_id(swigCPtr, this);
  }

  /**
   * Returns the team the unit belongs to.
   */
  public Team team() {
    return Team.swigToEnum(bcJNI.Unit_team(swigCPtr, this));
  }

  /**
   * Returns the current research level.
   */
  public long researchLevel() {
    return bcJNI.Unit_researchLevel(swigCPtr, this);
  }

  /**
   * Returns the unit type.
   */
  public UnitType unitType() {
    return UnitType.swigToEnum(bcJNI.Unit_unitType(swigCPtr, this));
  }

  /**
   * Returns the location of the unit.
   */
  public Location location() {
    long cPtr = bcJNI.Unit_location(swigCPtr, this);
    return (cPtr == 0) ? null : new Location(cPtr, true);
  }

  /**
   * Returns the current health.
   */
  public long health() {
    return bcJNI.Unit_health(swigCPtr, this);
  }

  /**
   * Returns the maximum health.
   */
  public long maxHealth() {
    return bcJNI.Unit_maxHealth(swigCPtr, this);
  }

  /**
   * Returns the unit vision range.
   */
  public long visionRange() {
    return bcJNI.Unit_visionRange(swigCPtr, this);
  }

  /**
   * Returns the damage inflicted by the robot during a normal attack.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public int damage() {
    return bcJNI.Unit_damage(swigCPtr, this);
  }

  /**
   * Returns the attack range.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long attackRange() {
    return bcJNI.Unit_attackRange(swigCPtr, this);
  }

  /**
   * Returns the movement heat.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long movementHeat() {
    return bcJNI.Unit_movementHeat(swigCPtr, this);
  }

  /**
   * Returns the attack heat.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long attackHeat() {
    return bcJNI.Unit_attackHeat(swigCPtr, this);
  }

  /**
   * Returns the movement cooldown.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long movementCooldown() {
    return bcJNI.Unit_movementCooldown(swigCPtr, this);
  }

  /**
   * Returns the attack cooldown.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long attackCooldown() {
    return bcJNI.Unit_attackCooldown(swigCPtr, this);
  }

  /**
   * Returns whether the active ability is unlocked.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public short isAbilityUnlocked() {
    return bcJNI.Unit_isAbilityUnlocked(swigCPtr, this);
  }

  /**
   * Returns the active ability heat.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long abilityHeat() {
    return bcJNI.Unit_abilityHeat(swigCPtr, this);
  }

  /**
   * Returns the active ability cooldown.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long abilityCooldown() {
    return bcJNI.Unit_abilityCooldown(swigCPtr, this);
  }

  /**
   * The active ability range. This is the range in which: workers can replicate, knights can javelin,
   * rangers can snipe, mages can blink, and healers can overcharge.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a robot.</dd>
   * </dl>
   */
  public long abilityRange() {
    return bcJNI.Unit_abilityRange(swigCPtr, this);
  }

  /**
   * Whether the worker has already acted (harveted, blueprinted, built, or repaired) this round.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a worker.</dd>
   * </dl>
   */
  public short workerHasActed() {
    return bcJNI.Unit_workerHasActed(swigCPtr, this);
  }

  /**
   * Returns the health restored when building a structure.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a worker.</dd>
   * </dl>
   */
  public long workerBuildHealth() {
    return bcJNI.Unit_workerBuildHealth(swigCPtr, this);
  }

  /**
   * Returns the health restored when repairing a structure.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a worker.</dd>
   * </dl>
   */
  public long workerRepairHealth() {
    return bcJNI.Unit_workerRepairHealth(swigCPtr, this);
  }

  /**
   * Returns the maximum amount of karbonite harvested from a deposit in one turn.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a worker.</dd>
   * </dl>
   */
  public long workerHarvestAmount() {
    return bcJNI.Unit_workerHarvestAmount(swigCPtr, this);
  }

  /**
   * Returns the amount of damage resisted by a knight when attacked.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a knight.</dd>
   * </dl>
   */
  public long knightDefense() {
    return bcJNI.Unit_knightDefense(swigCPtr, this);
  }

  /**
   * Returns the range within a ranger cannot attack.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a ranger.</dd>
   * </dl>
   */
  public long rangerCannotAttackRange() {
    return bcJNI.Unit_rangerCannotAttackRange(swigCPtr, this);
  }

  /**
   * Returns the maximum countdown for ranger's snipe, which is the number of turns that must pass before the snipe is executed.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a ranger.</dd>
   * </dl>
   */
  public long rangerMaxCountdown() {
    return bcJNI.Unit_rangerMaxCountdown(swigCPtr, this);
  }

  /**
   * Whether the ranger is sniping.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a ranger.</dd>
   * </dl>
   */
  public short rangerIsSniping() {
    return bcJNI.Unit_rangerIsSniping(swigCPtr, this);
  }

  /**
   * Returns the target location for ranger's snipe.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a ranger.</dd>
   *     <dd>NullValue - If the ranger is not sniping.</dd>
   * </dl>
   */
  public MapLocation rangerTargetLocation() {
    long cPtr = bcJNI.Unit_rangerTargetLocation(swigCPtr, this);
    return (cPtr == 0) ? null : new MapLocation(cPtr, true);
  }

  /**
   * Returns the countdown for ranger's snipe. Errors if the ranger is not sniping.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a ranger.</dd>
   *     <dd>NullValue - If the ranger is not sniping.</dd>
   * </dl>
   */
  public long rangerCountdown() {
    return bcJNI.Unit_rangerCountdown(swigCPtr, this);
  }

  /**
   * Returns the amount of health passively restored to itself each round.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a healer.</dd>
   * </dl>
   */
  public long healerSelfHealAmount() {
    return bcJNI.Unit_healerSelfHealAmount(swigCPtr, this);
  }

  /**
   * Whether this structure has been built.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a structure.</dd>
   * </dl>
   */
  public short structureIsBuilt() {
    return bcJNI.Unit_structureIsBuilt(swigCPtr, this);
  }

  /**
   * Returns the max capacity of a structure.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a structure.</dd>
   * </dl>
   */
  public long structureMaxCapacity() {
    return bcJNI.Unit_structureMaxCapacity(swigCPtr, this);
  }

  /**
   * Returns the units in the structure's garrison.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a structure.</dd>
   * </dl>
   */
  public VecUnitID structureGarrison() {
    long cPtr = bcJNI.Unit_structureGarrison(swigCPtr, this);
    return (cPtr == 0) ? null : new VecUnitID(cPtr, true);
  }

  /**
   * Whether the factory is currently producing a unit.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a factory.</dd>
   * </dl>
   */
  public short isFactoryProducing() {
    return bcJNI.Unit_isFactoryProducing(swigCPtr, this);
  }

  /**
   * Returns the unit type currently being produced by the factory.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a factory.</dd>
   *     <dd>NullValue - If the factory is not producing.</dd>
   * </dl>
   */
  public UnitType factoryUnitType() {
    return UnitType.swigToEnum(bcJNI.Unit_factoryUnitType(swigCPtr, this));
  }

  /**
   * Returns the number of rounds left to produce a robot in this factory.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a factory.</dd>
   *     <dd>NullValue - If the factory is not producing.</dd>
   * </dl>
   */
  public long factoryRoundsLeft() {
    return bcJNI.Unit_factoryRoundsLeft(swigCPtr, this);
  }

  /**
   * Returns the maximum number of rounds left to produce a robot in this factory.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a factory.</dd>
   * </dl>
   */
  public long factoryMaxRoundsLeft() {
    return bcJNI.Unit_factoryMaxRoundsLeft(swigCPtr, this);
  }

  /**
   * Whether the rocket has already been used.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a rocket.</dd>
   * </dl>
   */
  public short rocketIsUsed() {
    return bcJNI.Unit_rocketIsUsed(swigCPtr, this);
  }

  /**
   * Returns the damage a rocket deals to adjacent units upon landing.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a rocket.</dd>
   * </dl>
   */
  public int rocketBlastDamage() {
    return bcJNI.Unit_rocketBlastDamage(swigCPtr, this);
  }

  /**
   * Returns the number of rounds the rocket travel time is reduced by compared to the travel time determined by the orbit of the planets.
   *
   * <dl>
   *     <dt><span class="strong">Throws:</span></dt>
   *     <dd>InappropriateUnitType - If the unit is not a rocket.</dd>
   * </dl>
   */
  public long rocketTravelTimeDecrease() {
    return bcJNI.Unit_rocketTravelTimeDecrease(swigCPtr, this);
  }

}
