.class public final synthetic Lis0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lis0/a0;

.field public final synthetic x:Lis0/s0;


# direct methods
.method public synthetic constructor <init>(Lis0/a0;Lis0/s0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lis0/l;->w:Lis0/a0;

    iput-object p2, p0, Lis0/l;->x:Lis0/s0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lis0/l;->x:Lis0/s0;

    check-cast p1, Lg2/m;

    iget-object v1, p0, Lis0/l;->w:Lis0/a0;

    invoke-static {v1, v0, p1}, Lis0/p;->h(Lis0/a0;Lis0/s0;Lg2/m;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
