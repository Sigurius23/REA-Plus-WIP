.class public final synthetic Lrm/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lrm/q;->w:I

    iput-boolean p2, p0, Lrm/q;->x:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-boolean v0, p0, Lrm/q;->x:Z

    check-cast p1, Lrm/z0;

    iget v1, p0, Lrm/q;->w:I

    invoke-interface {p1, v1, v0}, Lrm/z0;->f(IZ)V

    return-void
.end method
