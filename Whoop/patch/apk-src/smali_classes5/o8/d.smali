.class public final Lo8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final w:Lo8/a;

.field public x:Z


# direct methods
.method public constructor <init>(Lro/d;Lo8/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lo8/d;->x:Z

    iput-object p2, p0, Lo8/d;->w:Lo8/a;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lo8/d;->w:Lo8/a;

    invoke-interface {v0, p1}, Lo8/a;->p(Ljava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo8/d;->x:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lo8/d;->w:Lo8/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
