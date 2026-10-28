.class public final Lpj/l;
.super Lz63/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:J


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lpj/l;->a:Lkotlin/jvm/functions/Function1;

    iput-wide p1, p0, Lpj/l;->b:J

    return-void
.end method


# virtual methods
.method public final d(Lg9/k;)V
    .locals 4

    new-instance v0, Lpj/j;

    iget-wide v1, p0, Lpj/l;->b:J

    iget-object v3, p0, Lpj/l;->a:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2, v3}, Lpj/j;-><init>(JLkotlin/jvm/functions/Function1;)V

    const-class v1, Laf3/p;

    invoke-virtual {p1, v1, v0}, Lg9/k;->b(Ljava/lang/Class;Lz63/e;)V

    return-void
.end method
