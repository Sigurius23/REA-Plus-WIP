.class public final Lfl0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfl0/f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lfl0/f;",
        "",
        "<init>",
        "()V",
        "",
        "orientation",
        "Lfl0/f$a;",
        "a",
        "(I)Lfl0/f$a;",
        "bot_release"
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
.field public static final a:Lfl0/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfl0/f;

    invoke-direct {v0}, Lfl0/f;-><init>()V

    sput-object v0, Lfl0/f;->a:Lfl0/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Lfl0/f$a;
    .locals 5

    const/high16 v0, 0x42b40000    # 90.0f

    const/high16 v1, 0x43870000    # 270.0f

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v2, v4, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_0
    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v1, v4, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_1
    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v1, v3, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_2
    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v0, v4, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_3
    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v0, v3, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_4
    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v2, v4, v3}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_5
    new-instance p1, Lfl0/f$a;

    const/high16 v0, 0x43340000    # 180.0f

    invoke-direct {p1, v0, v4, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_6
    new-instance p1, Lfl0/f$a;

    invoke-direct {p1, v2, v3, v4}, Lfl0/f$a;-><init>(FZZ)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
