.class public final Lkp2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkp2/d;",
        "",
        "<init>",
        "()V",
        "",
        "fieldId",
        "Lc2/n;",
        "a",
        "(Ljava/lang/String;)Lc2/n;",
        "universal-checkout_release"
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
.field public static final a:Lkp2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkp2/d;

    invoke-direct {v0}, Lkp2/d;-><init>()V

    sput-object v0, Lkp2/d;->a:Lkp2/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lc2/n;
    .locals 1

    const-string v0, "fieldId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "COUNTRY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lc2/n;->N:Lc2/n;

    return-object p1

    :sswitch_1
    const-string v0, "LAST_NAME"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    sget-object p1, Lc2/n;->V:Lc2/n;

    return-object p1

    :sswitch_2
    const-string v0, "FIRST_NAME"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object p1, Lc2/n;->U:Lc2/n;

    return-object p1

    :sswitch_3
    const-string v0, "POSTAL_CODE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    sget-object p1, Lc2/n;->G:Lc2/n;

    return-object p1

    :sswitch_4
    const-string v0, "PHONE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    sget-object p1, Lc2/n;->a0:Lc2/n;

    return-object p1

    :sswitch_5
    const-string v0, "LINE2"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    sget-object p1, Lc2/n;->R:Lc2/n;

    return-object p1

    :sswitch_6
    const-string v0, "LINE1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    sget-object p1, Lc2/n;->Q:Lc2/n;

    return-object p1

    :sswitch_7
    const-string v0, "CITY"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    sget-object p1, Lc2/n;->P:Lc2/n;

    return-object p1

    :sswitch_8
    const-string v0, "PROVINCE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_8
    sget-object p1, Lc2/n;->O:Lc2/n;

    return-object p1

    :sswitch_data_0
    .sparse-switch
        -0xc35e4d0 -> :sswitch_8
        0x1f916b -> :sswitch_7
        0x45156bd -> :sswitch_6
        0x45156be -> :sswitch_5
        0x489454e -> :sswitch_4
        0x7b434e1 -> :sswitch_3
        0x15146ada -> :sswitch_2
        0x1fd8ce94 -> :sswitch_1
        0x63e2e376 -> :sswitch_0
    .end sparse-switch
.end method
