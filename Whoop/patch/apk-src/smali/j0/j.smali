.class public final Lj0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj0/i;


# instance fields
.field public final a:Lec3/w1;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ldc3/a;->x:Ldc3/a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x10

    invoke-static {v2, v3, v0, v1}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lj0/j;->a:Lec3/w1;

    return-void
.end method


# virtual methods
.method public final a(Lj0/h;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj0/j;->a:Lec3/w1;

    invoke-virtual {v0, p1, p2}, Lec3/w1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b(Lj0/h;)Z
    .locals 1

    iget-object v0, p0, Lj0/j;->a:Lec3/w1;

    invoke-virtual {v0, p1}, Lec3/w1;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
