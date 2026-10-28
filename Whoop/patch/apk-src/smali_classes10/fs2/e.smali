.class public final Lfs2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfs2/m;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0017\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0017\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lfs2/e;",
        "Lfs2/m;",
        "<init>",
        "()V",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onLeaveCompleted",
        "Lhs2/c;",
        "participants",
        "b",
        "(Lc93/a;Lhs2/c;Landroidx/compose/runtime/Composer;I)V",
        "Lhs2/b;",
        "localParticipant",
        "",
        "arePermissionsEnabled",
        "a",
        "(Lhs2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "video-call_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic c(Lfs2/e;Lc93/a;Lhs2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfs2/e;->e(Lfs2/e;Lc93/a;Lhs2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lfs2/e;Lhs2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lfs2/e;->f(Lfs2/e;Lhs2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Lfs2/e;Lc93/a;Lhs2/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-virtual {p0, p1, p2, p4, p3}, Lfs2/e;->b(Lc93/a;Lhs2/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lfs2/e;Lhs2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-virtual {p0, p1, p2, p4, p3}, Lfs2/e;->a(Lhs2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public a(Lhs2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "localParticipant"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, 0x16b50835

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_2

    new-instance v0, Lar2/f;

    const/16 v5, 0xe

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZII)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method public b(Lc93/a;Lhs2/c;Landroidx/compose/runtime/Composer;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lhs2/c;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "onLeaveCompleted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "participants"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, 0x690a7df8

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_2

    new-instance v0, Lcy1/b;

    const/16 v5, 0xf

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lcy1/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method
