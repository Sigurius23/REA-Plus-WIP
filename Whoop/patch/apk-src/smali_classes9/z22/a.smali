.class public final Lz22/a;
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
.field public static final a:Lz22/a;

.field private static b:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lz22/a;

    invoke-direct {v0}, Lz22/a;-><init>()V

    sput-object v0, Lz22/a;->a:Lz22/a;

    new-instance v0, Lx31/a;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lx31/a;-><init>(I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x0

    const v3, -0x42f5b24b

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    sput-object v1, Lz22/a;->b:Lc93/m;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lz22/a;->c(Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

    and-int/lit8 v0, p1, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p1, v2

    move-object v6, p0

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p1, v0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lx81/d;->a:Lx81/d;

    const/4 p1, 0x6

    invoke-static {p0, v6, p1}, Lev/n;->r(Lx81/d;Lp1/q;I)Lo2/e;

    move-result-object v1

    sget p1, Lx81/d;->b:I

    invoke-virtual {p0, v6, p1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->y()J

    move-result-wide v4

    const/16 v7, 0x30

    const/4 v8, 0x4

    const-string v2, "Back"

    const/4 v3, 0x0

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    sget-object v0, Lz22/a;->b:Lc93/m;

    return-object v0
.end method
