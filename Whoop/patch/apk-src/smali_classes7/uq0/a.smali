.class public final Luq0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Luq0/a;",
        "",
        "<init>",
        "()V",
        "",
        "collectionName",
        "Lcom/whoop/community/share/WidgetCollectionName;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/community/share/WidgetCollectionName;",
        "core_release"
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
.field public static final a:Luq0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Luq0/a;

    invoke-direct {v0}, Luq0/a;-><init>()V

    sput-object v0, Luq0/a;->a:Luq0/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/whoop/community/share/WidgetCollectionName;
    .locals 1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "recovery_trend"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->RECOVERY_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_1
    const-string v0, "sleep_trend"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->SLEEP_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_2
    const-string v0, "overview"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_3
    const-string v0, "sleep"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->SLEEP:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_4
    const-string v0, "strain_trend"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->STRAIN_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_5
    const-string v0, "overview_trend"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW_TREND:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_6
    const-string v0, "recovery"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->RECOVERY:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :sswitch_7
    const-string v0, "strain"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->STRAIN:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    :cond_8
    :goto_0
    sget-object p1, Lcom/whoop/community/share/WidgetCollectionName;->OVERVIEW:Lcom/whoop/community/share/WidgetCollectionName;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x352abe8b -> :sswitch_7
        -0x2fa1806b -> :sswitch_6
        -0x24066ca9 -> :sswitch_5
        -0x1df205ad -> :sswitch_4
        0x6872ed7 -> :sswitch_3
        0x1f98ed79 -> :sswitch_2
        0x39fcd635 -> :sswitch_1
        0x3bf82073 -> :sswitch_0
    .end sparse-switch
.end method
