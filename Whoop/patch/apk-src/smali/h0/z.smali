.class public final Lh0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/n1;


# instance fields
.field public final a:Lkotlin/jvm/functions/Function1;

.field public final b:Lh0/y;

.field public final c:Lf0/c1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/z;->a:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lh0/y;

    invoke-direct {p1, p0}, Lh0/y;-><init>(Lh0/z;)V

    iput-object p1, p0, Lh0/z;->b:Lh0/y;

    new-instance p1, Lf0/c1;

    invoke-direct {p1}, Lf0/c1;-><init>()V

    iput-object p1, p0, Lh0/z;->c:Lf0/c1;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La6/v;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, La6/v;-><init>(Lh0/z;Lf0/z0;Lc93/m;Lq83/d;)V

    invoke-static {v0, p3}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
