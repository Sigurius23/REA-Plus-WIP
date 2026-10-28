.class public final synthetic Lrm/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/w;


# instance fields
.field public final synthetic a:Lb9/b1;


# direct methods
.method public synthetic constructor <init>(Lb9/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrm/r0;->a:Lb9/b1;

    return-void
.end method


# virtual methods
.method public final a(Lsn/a;Lrm/o1;)V
    .locals 0

    iget-object p1, p0, Lrm/r0;->a:Lb9/b1;

    iget-object p1, p1, Lb9/b1;->i:Landroid/os/Handler$Callback;

    check-cast p1, Lrm/z;

    iget-object p1, p1, Lrm/z;->H:Llo/v;

    const/16 p2, 0x16

    invoke-virtual {p1, p2}, Llo/v;->c(I)Z

    return-void
.end method
