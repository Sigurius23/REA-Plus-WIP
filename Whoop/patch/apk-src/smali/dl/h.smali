.class public final Ldl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/u;


# instance fields
.field public final a:Ldl/e;


# direct methods
.method public constructor <init>(Ldl/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldl/h;->a:Ldl/e;

    return-void
.end method


# virtual methods
.method public final a(Ldl/z;)Ldl/t;
    .locals 2

    new-instance p1, Ldl/d;

    iget-object v0, p0, Ldl/h;->a:Ldl/e;

    const/4 v1, 0x2

    invoke-direct {p1, v0, v1}, Ldl/d;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method
