.class public final synthetic Li92/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/g;


# instance fields
.field public final synthetic w:Li92/p;


# direct methods
.method public synthetic constructor <init>(Li92/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li92/r;->w:Li92/p;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Li92/r;->w:Li92/p;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Li92/s;->b(Li92/p;Ljava/lang/Throwable;)Lpg3/v0;

    move-result-object p1

    return-object p1
.end method
