.class public final Lb9/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lb9/l0;


# direct methods
.method public constructor <init>(Lb9/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/h0;->a:Lb9/l0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lb9/h0;->a:Lb9/l0;

    iget-boolean v1, v0, Lb9/l0;->n0:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb9/l0;->H:Lx8/r;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lx8/r;->e(I)Z

    :cond_0
    return-void
.end method
