.class public final Lce/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln83/f;

.field public final b:Lce/h;


# direct methods
.method public constructor <init>(Ln83/f;Lce/h;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/j;->a:Ln83/f;

    iput-object p2, p0, Lce/j;->b:Lce/h;

    return-void
.end method


# virtual methods
.method public final a()Lce/k;
    .locals 4

    invoke-virtual {p0}, Lce/j;->b()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lce/j;->b:Lce/h;

    iget-object v2, v1, Lce/h;->a:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/k;

    if-nez v0, :cond_0

    new-instance v0, Lce/k;

    iget-object v1, v1, Lce/h;->a:Ljava/lang/String;

    sget-object v2, Lm83/z;->w:Lm83/z;

    sget-object v3, Lce/l;->w:Lce/l;

    invoke-direct {v0, v1, v2, v3}, Lce/k;-><init>(Ljava/lang/String;Ljava/util/Map;Lce/l;)V

    :cond_0
    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lce/j;->a:Ln83/f;

    sget-object v1, Lce/l;->w:Lce/l;

    invoke-virtual {v0, v1}, Ln83/f;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_0

    sget-object v0, Lm83/z;->w:Lm83/z;

    :cond_0
    return-object v0
.end method
