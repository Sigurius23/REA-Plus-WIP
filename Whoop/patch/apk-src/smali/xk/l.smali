.class public final Lxk/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxk/f;


# instance fields
.field public final a:Lal/g;


# direct methods
.method public constructor <init>(Lal/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxk/l;->a:Lal/g;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Lxk/g;
    .locals 2

    check-cast p1, Ljava/io/InputStream;

    new-instance v0, Lty/c;

    iget-object v1, p0, Lxk/l;->a:Lal/g;

    invoke-direct {v0, p1, v1}, Lty/c;-><init>(Ljava/io/InputStream;Lal/g;)V

    return-object v0
.end method

.method public final b()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method
