.class public final Lcom/iterable/iterableapi/q0;
.super Landroid/app/Dialog;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lcom/iterable/iterableapi/v0;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/v0;Landroidx/fragment/app/r0;I)V
    .locals 0

    iput-object p1, p0, Lcom/iterable/iterableapi/q0;->w:Lcom/iterable/iterableapi/v0;

    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-void
.end method


# virtual methods
.method public final onBackPressed()V
    .locals 6

    iget-object v0, p0, Lcom/iterable/iterableapi/q0;->w:Lcom/iterable/iterableapi/v0;

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v2, v0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    const-string v3, "itbl://backButton"

    invoke-virtual {v1, v2, v3}, Lcom/iterable/iterableapi/k;->n(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v2, v0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    sget-object v4, Lcom/iterable/iterableapi/k0;->w:Lcom/iterable/iterableapi/h0;

    sget-object v5, Lcom/iterable/iterableapi/v0;->P:Lcom/iterable/iterableapi/y0;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/iterable/iterableapi/k;->o(Ljava/lang/String;Ljava/lang/String;Lcom/iterable/iterableapi/k0;Lcom/iterable/iterableapi/a1;)V

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v0;->F()V

    iget-object v0, p0, Lcom/iterable/iterableapi/q0;->w:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v0;->E()V

    return-void
.end method
