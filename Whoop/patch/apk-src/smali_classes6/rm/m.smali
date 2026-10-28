.class public final synthetic Lrm/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llo/h;


# instance fields
.field public final synthetic w:Lrm/u;


# direct methods
.method public synthetic constructor <init>(Lrm/u;)V
    .locals 0

    iput-object p1, p0, Lrm/m;->w:Lrm/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lrm/z0;

    iget-object v0, p0, Lrm/m;->w:Lrm/u;

    iget-object v0, v0, Lrm/u;->o0:Lrm/x0;

    invoke-interface {p1, v0}, Lrm/z0;->j(Lrm/x0;)V

    return-void
.end method
