.class public abstract Llive/hms/video/database/EventsDatabase;
.super Landroidx/room/z0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/database/EventsDatabase$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Llive/hms/video/database/EventsDatabase;",
        "Landroidx/room/z0;",
        "<init>",
        "()V",
        "Llive/hms/video/database/dao/AnalyticsEventsDao;",
        "logDao",
        "()Llive/hms/video/database/dao/AnalyticsEventsDao;",
        "Companion",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Llive/hms/video/database/EventsDatabase$Companion;

.field private static volatile INSTANCE:Llive/hms/video/database/EventsDatabase; = null

.field private static final MIGRATION_1_2:Lmb/b;

.field private static final MIGRATION_2_3:Lmb/b;

.field private static final MIGRATION_3_4:Lmb/b;

.field public static final TABLE_NAME:Ljava/lang/String; = "analytics_table"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/database/EventsDatabase$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/database/EventsDatabase$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/database/EventsDatabase;->Companion:Llive/hms/video/database/EventsDatabase$Companion;

    new-instance v0, Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_1_2$1;

    invoke-direct {v0}, Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_1_2$1;-><init>()V

    sput-object v0, Llive/hms/video/database/EventsDatabase;->MIGRATION_1_2:Lmb/b;

    new-instance v0, Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_2_3$1;

    invoke-direct {v0}, Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_2_3$1;-><init>()V

    sput-object v0, Llive/hms/video/database/EventsDatabase;->MIGRATION_2_3:Lmb/b;

    new-instance v0, Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_3_4$1;

    invoke-direct {v0}, Llive/hms/video/database/EventsDatabase$Companion$MIGRATION_3_4$1;-><init>()V

    sput-object v0, Llive/hms/video/database/EventsDatabase;->MIGRATION_3_4:Lmb/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/room/z0;-><init>()V

    return-void
.end method

.method public static final synthetic access$getINSTANCE$cp()Llive/hms/video/database/EventsDatabase;
    .locals 1

    sget-object v0, Llive/hms/video/database/EventsDatabase;->INSTANCE:Llive/hms/video/database/EventsDatabase;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_1_2$cp()Lmb/b;
    .locals 1

    sget-object v0, Llive/hms/video/database/EventsDatabase;->MIGRATION_1_2:Lmb/b;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_2_3$cp()Lmb/b;
    .locals 1

    sget-object v0, Llive/hms/video/database/EventsDatabase;->MIGRATION_2_3:Lmb/b;

    return-object v0
.end method

.method public static final synthetic access$getMIGRATION_3_4$cp()Lmb/b;
    .locals 1

    sget-object v0, Llive/hms/video/database/EventsDatabase;->MIGRATION_3_4:Lmb/b;

    return-object v0
.end method

.method public static final synthetic access$setINSTANCE$cp(Llive/hms/video/database/EventsDatabase;)V
    .locals 0

    sput-object p0, Llive/hms/video/database/EventsDatabase;->INSTANCE:Llive/hms/video/database/EventsDatabase;

    return-void
.end method


# virtual methods
.method public abstract logDao()Llive/hms/video/database/dao/AnalyticsEventsDao;
.end method
