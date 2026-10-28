.class public final Lg2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg2/l;

.field public final b:Landroidx/compose/ui/platform/AndroidComposeView;

.field public final c:La0/w0;

.field public final d:La0/w0;

.field public e:Z


# direct methods
.method public constructor <init>(Lg2/l;Landroidx/compose/ui/platform/AndroidComposeView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/h;->a:Lg2/l;

    iput-object p2, p0, Lg2/h;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    sget-object p1, La0/e1;->a:La0/w0;

    new-instance p1, La0/w0;

    invoke-direct {p1}, La0/w0;-><init>()V

    iput-object p1, p0, Lg2/h;->c:La0/w0;

    new-instance p1, La0/w0;

    invoke-direct {p1}, La0/w0;-><init>()V

    iput-object p1, p0, Lg2/h;->d:La0/w0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lg2/h;->e:Z

    if-nez v0, :cond_1

    new-instance v0, Lb30/i0;

    invoke-direct {v0, p0}, Lb30/i0;-><init>(Lg2/h;)V

    iget-object v1, p0, Lg2/h;->b:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, v1, Landroidx/compose/ui/platform/AndroidComposeView;->V0:La0/q0;

    invoke-virtual {v1, v0}, La0/q0;->f(Ljava/lang/Object;)I

    move-result v2

    if-ltz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v0}, La0/q0;->a(Ljava/lang/Object;)V

    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lg2/h;->e:Z

    :cond_1
    return-void
.end method
