.class public final Ll51/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll51/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\r\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000e\u001a\u0004\u0008\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u000eR \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Ll51/g$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/design/util/TextResource;",
        "subtitle",
        "Lb91/c;",
        "subtitleStyle",
        "",
        "stickOnScroll",
        "Ly3/f;",
        "e",
        "(Lcom/whoop/design/util/TextResource;Lb91/c;Z)F",
        "EXPANDED_HEIGHT_DP",
        "F",
        "b",
        "()F",
        "COLLAPSED_TOOLBAR_HEIGHT_DP",
        "a",
        "SUBTITLE_BOTTOM_INSET_DP",
        "c",
        "SUBTITLE_TOP_INSET_COLLAPSED_DP",
        "d",
        "STICKY_SUBTITLE_LINE_APPROX_DP",
        "",
        "STICKY_SUBTITLE_LINE_APPROX_BY_STYLE",
        "Ljava/util/Map;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ll51/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    invoke-static {}, Ll51/g;->a()F

    move-result v0

    return v0
.end method

.method public final b()F
    .locals 1

    invoke-static {}, Ll51/g;->b()F

    move-result v0

    return v0
.end method

.method public final c()F
    .locals 1

    invoke-static {}, Ll51/g;->f()F

    move-result v0

    return v0
.end method

.method public final d()F
    .locals 1

    invoke-static {}, Ll51/g;->g()F

    move-result v0

    return v0
.end method

.method public final e(Lcom/whoop/design/util/TextResource;Lb91/c;Z)F
    .locals 1

    const-string v0, "subtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    invoke-static {}, Ll51/g;->c()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/f;

    if-eqz p1, :cond_0

    iget p1, p1, Ly3/f;->w:F

    goto :goto_0

    :cond_0
    invoke-static {}, Ll51/g;->e()F

    move-result p1

    :goto_0
    invoke-virtual {p0}, Ll51/g$a;->d()F

    move-result p2

    add-float/2addr p2, p1

    invoke-virtual {p0}, Ll51/g$a;->c()F

    move-result p1

    add-float/2addr p1, p2

    return p1

    :cond_1
    const/4 p1, 0x0

    int-to-float p1, p1

    return p1
.end method
