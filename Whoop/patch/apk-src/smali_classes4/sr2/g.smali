.class public final Lsr2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R!\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0006\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lsr2/g;",
        "",
        "<init>",
        "()V",
        "",
        "Lnd1/j;",
        "b",
        "Ll83/h;",
        "()Ljava/util/List;",
        "moduleList",
        "app_prodStandardRelease"
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
.field public static final a:Lsr2/g;

.field private static final b:Ll83/h;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsr2/g;

    invoke-direct {v0}, Lsr2/g;-><init>()V

    sput-object v0, Lsr2/g;->a:Lsr2/g;

    new-instance v0, Ls52/d;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lsr2/g;->b:Ll83/h;

    const/16 v0, 0x8

    sput v0, Lsr2/g;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    invoke-static {}, Lsr2/g;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final c()Ljava/util/List;
    .locals 2

    new-instance v0, Lnd1/l;

    new-instance v1, Lsr2/f;

    invoke-direct {v1}, Lsr2/f;-><init>()V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lnd1/l;-><init>(Ljava/util/List;)V

    invoke-virtual {v0}, Lnd1/l;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    sget-object v0, Lsr2/g;->b:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
