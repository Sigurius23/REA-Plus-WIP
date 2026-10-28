.class public interface abstract Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0005R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0012\u0010\u000c\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "",
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
        "Companion",
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

.annotation runtime Lwc3/i;
    with = Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;->$$INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;->Companion:Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;

    return-void
.end method


# virtual methods
.method public abstract getDate()Ljava/lang/String;
.end method

.method public abstract getDateValueDisplay()Ljava/lang/String;
.end method

.method public abstract getHasData()Z
.end method

.method public abstract getHidden()Z
.end method

.method public abstract getInteraction()Lcom/whoop/navigation/models/GenericInteraction;
.end method
