.class public final Ll51/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Ll51/f;",
        "",
        "Ln0/u;",
        "listState",
        "Lt2/a;",
        "nestedScrollConnection",
        "Lp1/a1;",
        "consumedOffsetPx",
        "",
        "maxConsumePx",
        "<init>",
        "(Ln0/u;Lt2/a;Lp1/a1;I)V",
        "Ll51/g;",
        "base",
        "a",
        "(Ll51/g;)Ll51/g;",
        "Ln0/u;",
        "c",
        "()Ln0/u;",
        "b",
        "Lt2/a;",
        "d",
        "()Lt2/a;",
        "Lp1/a1;",
        "I",
        "",
        "()F",
        "collapseProgress",
        "",
        "e",
        "()Z",
        "isCollapsed",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ln0/u;

.field private final b:Lt2/a;

.field private final c:Lp1/a1;

.field private final d:I


# direct methods
.method public constructor <init>(Ln0/u;Lt2/a;Lp1/a1;I)V
    .locals 1

    const-string v0, "listState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nestedScrollConnection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consumedOffsetPx"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll51/f;->a:Ln0/u;

    iput-object p2, p0, Ll51/f;->b:Lt2/a;

    iput-object p3, p0, Ll51/f;->c:Lp1/a1;

    iput p4, p0, Ll51/f;->d:I

    return-void
.end method


# virtual methods
.method public final a(Ll51/g;)Ll51/g;
    .locals 13

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ll51/f;->e()Z

    move-result v9

    invoke-virtual {p0}, Ll51/f;->b()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v12}, Ll51/g;->i(Ll51/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll51/h;Ll51/h;Lkd1/o;Lb91/c;ZZLjava/lang/Float;ILjava/lang/Object;)Ll51/g;

    move-result-object p1

    return-object p1
.end method

.method public final b()F
    .locals 3

    iget-object v0, p0, Ll51/f;->c:Lp1/a1;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll51/f;->d:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Le93/b;->m(FFF)F

    move-result v0

    return v0
.end method

.method public final c()Ln0/u;
    .locals 1

    iget-object v0, p0, Ll51/f;->a:Ln0/u;

    return-object v0
.end method

.method public final d()Lt2/a;
    .locals 1

    iget-object v0, p0, Ll51/f;->b:Lt2/a;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    invoke-virtual {p0}, Ll51/f;->b()F

    move-result v0

    const v1, 0x3f7d70a4    # 0.99f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
