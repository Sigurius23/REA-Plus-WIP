.class public final Lec3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final w:Lec3/l;

.field public final x:Lkotlin/jvm/functions/Function1;

.field public final y:Lc93/m;


# direct methods
.method public constructor <init>(Lec3/l;Lkotlin/jvm/functions/Function1;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/j;->w:Lec3/l;

    iput-object p2, p0, Lec3/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lec3/j;->y:Lc93/m;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lfc3/b;->b:Lhc3/x;

    iput-object v1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v1, Lc0/a0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v0, p1, v2}, Lc0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget-object p1, p0, Lec3/j;->w:Lec3/l;

    invoke-interface {p1, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
