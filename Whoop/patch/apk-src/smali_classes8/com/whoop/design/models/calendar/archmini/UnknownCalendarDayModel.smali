.class public final Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0014\u001a\u00020\u000b2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "<init>",
        "()V",
        "date",
        "",
        "getDate",
        "()Ljava/lang/String;",
        "dateValueDisplay",
        "getDateValueDisplay",
        "hasData",
        "",
        "getHasData",
        "()Z",
        "hidden",
        "getHidden",
        "interaction",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getInteraction",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;

.field private static final date:Ljava/lang/String;

.field private static final dateValueDisplay:Ljava/lang/String;

.field private static final hasData:Z

.field private static final hidden:Z

.field private static final interaction:Lcom/whoop/navigation/models/GenericInteraction;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;

    invoke-direct {v0}, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;-><init>()V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->INSTANCE:Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;

    const-string v0, ""

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public getDate()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->date:Ljava/lang/String;

    return-object v0
.end method

.method public getDateValueDisplay()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->dateValueDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public getHasData()Z
    .locals 1

    sget-boolean v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->hasData:Z

    return v0
.end method

.method public getHidden()Z
    .locals 1

    sget-boolean v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->hidden:Z

    return v0
.end method

.method public getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/UnknownCalendarDayModel;->interaction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x77b3d334

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "UnknownCalendarDayModel"

    return-object v0
.end method
