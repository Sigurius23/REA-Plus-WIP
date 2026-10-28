.class public final Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;",
        "",
        "<init>",
        "()V",
        "Lwc3/c;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "serializer",
        "()Lwc3/c;",
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
.field static final synthetic $$INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;

    invoke-direct {v0}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;-><init>()V

    sput-object v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;->$$INSTANCE:Lcom/whoop/design/models/calendar/archmini/CalendarDayModel$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;

    invoke-direct {v0}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModelSerializer;-><init>()V

    return-object v0
.end method
