.class public final Lvn1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lvn1/e;

.field private static b:Lc93/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/n;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lvn1/e;

    invoke-direct {v0}, Lvn1/e;-><init>()V

    sput-object v0, Lvn1/e;->a:Lvn1/e;

    new-instance v0, Lvn1/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x4706d8ae

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lvn1/e;->b:Lc93/n;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lvn1/e;->c(Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lc0/o;Lm91/n;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "animatedNextCard"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    shr-int/lit8 p0, p3, 0x3

    and-int/lit8 p0, p0, 0xe

    invoke-static {p1, p2, p0}, Lvn1/p;->l(Lm91/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lc93/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/n;"
        }
    .end annotation

    sget-object v0, Lvn1/e;->b:Lc93/n;

    return-object v0
.end method
