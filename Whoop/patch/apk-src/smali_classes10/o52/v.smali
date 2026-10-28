.class public final synthetic Lo52/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:Lo52/w;

.field public final synthetic x:Landroidx/lifecycle/p0;


# direct methods
.method public synthetic constructor <init>(Lo52/w;Landroidx/lifecycle/p0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo52/v;->w:Lo52/w;

    iput-object p2, p0, Lo52/v;->x:Landroidx/lifecycle/p0;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lo52/v;->x:Landroidx/lifecycle/p0;

    check-cast p1, Ljava/util/List;

    iget-object v1, p0, Lo52/v;->w:Lo52/w;

    invoke-static {v1, v0, p1}, Lo52/w;->R(Lo52/w;Landroidx/lifecycle/p0;Ljava/util/List;)V

    return-void
.end method
