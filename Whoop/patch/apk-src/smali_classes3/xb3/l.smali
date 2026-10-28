.class public final Lxb3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# instance fields
.field public final synthetic w:Lxb3/i;


# direct methods
.method public constructor <init>(Lxb3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb3/l;->w:Lxb3/i;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, Lxb3/l;->w:Lxb3/i;

    invoke-interface {v0}, Lxb3/i;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
