.class public final synthetic Lb9/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/d0;


# instance fields
.field public final synthetic a:Lb9/b1;


# direct methods
.method public synthetic constructor <init>(Lb9/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/u0;->a:Lb9/b1;

    return-void
.end method


# virtual methods
.method public final a(Ll9/a;Lu8/o0;)V
    .locals 0

    iget-object p1, p0, Lb9/u0;->a:Lb9/b1;

    iget-object p1, p1, Lb9/b1;->i:Landroid/os/Handler$Callback;

    check-cast p1, Lb9/l0;

    iget-object p1, p1, Lb9/l0;->H:Lx8/r;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Lx8/r;->d(I)V

    const/16 p2, 0x16

    invoke-virtual {p1, p2}, Lx8/r;->e(I)Z

    return-void
.end method
