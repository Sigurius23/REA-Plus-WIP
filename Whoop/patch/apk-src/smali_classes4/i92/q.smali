.class public final synthetic Li92/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/g;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Li92/p;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Li92/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li92/q;->w:Ljava/lang/String;

    iput-object p2, p0, Li92/q;->x:Li92/p;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li92/q;->x:Li92/p;

    check-cast p1, Lpg3/v0;

    iget-object v1, p0, Li92/q;->w:Ljava/lang/String;

    invoke-static {v1, v0, p1}, Li92/s;->a(Ljava/lang/String;Li92/p;Lpg3/v0;)Lpg3/v0;

    move-result-object p1

    return-object p1
.end method
