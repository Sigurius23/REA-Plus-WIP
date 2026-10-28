.class public abstract Lsc3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc3/j;


# instance fields
.field public final a:Lsc3/a;


# direct methods
.method public constructor <init>(Lsc3/a;Ljava/util/List;)V
    .locals 0

    const-string p2, "field"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsc3/i;->a:Lsc3/a;

    return-void
.end method


# virtual methods
.method public final a()Ltc3/a;
    .locals 2

    new-instance v0, Ltc3/a;

    new-instance v1, Lq00/h0;

    iget-object v1, p0, Lsc3/i;->a:Lsc3/a;

    invoke-virtual {v1}, Lsc3/a;->a()Lsc3/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public final b()Luc3/l;
    .locals 5

    new-instance v0, Luc3/l;

    new-instance v1, Luc3/f;

    new-instance v2, Luc3/a;

    iget-object v3, p0, Lsc3/i;->a:Lsc3/a;

    invoke-virtual {v3}, Lsc3/a;->a()Lsc3/r;

    move-result-object v4

    invoke-virtual {v3}, Lsc3/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Luc3/a;-><init>(Lsc3/r;Ljava/lang/String;)V

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Luc3/f;-><init>(Ljava/util/List;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget-object v2, Lm83/y;->w:Lm83/y;

    invoke-direct {v0, v1, v2}, Luc3/l;-><init>(Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public final c()Lsc3/a;
    .locals 1

    iget-object v0, p0, Lsc3/i;->a:Lsc3/a;

    return-object v0
.end method
