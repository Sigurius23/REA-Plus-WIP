.class public final Lds/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:Lds/o;

.field public final x:Lds/v;


# direct methods
.method public constructor <init>(Lds/o;Lds/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lds/e;->w:Lds/o;

    iput-object p2, p0, Lds/e;->x:Lds/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lds/e;->w:Lds/o;

    iget-object v0, v0, Lds/n;->w:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lds/e;->x:Lds/v;

    invoke-static {v0}, Lds/n;->h(Lds/v;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lds/n;->F:Lbi/g;

    iget-object v2, p0, Lds/e;->w:Lds/o;

    invoke-virtual {v1, v2, p0, v0}, Lbi/g;->k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lds/e;->w:Lds/o;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lds/n;->e(Lds/n;Z)V

    :cond_1
    :goto_0
    return-void
.end method
