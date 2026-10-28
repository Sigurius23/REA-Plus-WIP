.class public final Lcom/iterable/iterableapi/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic w:Lcom/iterable/iterableapi/v0;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/r0;->w:Lcom/iterable/iterableapi/v0;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lcom/iterable/iterableapi/r0;->w:Lcom/iterable/iterableapi/v0;

    iget-boolean p1, p1, Lcom/iterable/iterableapi/v0;->z:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/iterable/iterableapi/v0;->O:Lqg3/d;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lqg3/d;->p(Landroid/net/Uri;)V

    :cond_0
    return-void
.end method
