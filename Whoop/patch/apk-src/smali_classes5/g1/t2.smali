.class public abstract Lg1/t2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/e2;

.field public static final b:Ld0/e2;

.field public static final c:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ld0/e2;

    sget-object v1, Ld0/b0;->a:Ld0/v;

    const/16 v2, 0x78

    const/4 v3, 0x2

    invoke-direct {v0, v2, v1, v3}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/t2;->a:Ld0/e2;

    new-instance v0, Ld0/e2;

    new-instance v1, Ld0/v;

    const v4, 0x3ecccccd    # 0.4f

    const/4 v5, 0x0

    const v6, 0x3f19999a    # 0.6f

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v1, v4, v5, v6, v7}, Ld0/v;-><init>(FFFF)V

    const/16 v8, 0x96

    invoke-direct {v0, v8, v1, v3}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/t2;->b:Ld0/e2;

    new-instance v0, Ld0/e2;

    new-instance v1, Ld0/v;

    invoke-direct {v1, v4, v5, v6, v7}, Ld0/v;-><init>(FFFF)V

    invoke-direct {v0, v2, v1, v3}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/t2;->c:Ld0/e2;

    return-void
.end method

.method public static final a(Ld0/e;FLj0/h;Lj0/h;Ls83/c;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    if-eqz p3, :cond_4

    instance-of p2, p3, Lj0/l;

    sget-object v1, Lg1/t2;->a:Ld0/e2;

    if-eqz p2, :cond_0

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_0
    instance-of p2, p3, Lj0/b;

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    instance-of p2, p3, Lj0/f;

    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    instance-of p2, p3, Lj0/d;

    if-eqz p2, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    move-object v3, v0

    goto :goto_3

    :cond_4
    if-eqz p2, :cond_3

    instance-of p3, p2, Lj0/l;

    sget-object v1, Lg1/t2;->b:Ld0/e2;

    if-eqz p3, :cond_5

    :goto_2
    goto :goto_0

    :cond_5
    instance-of p3, p2, Lj0/b;

    if-eqz p3, :cond_6

    goto :goto_2

    :cond_6
    instance-of p3, p2, Lj0/f;

    if-eqz p3, :cond_7

    sget-object v0, Lg1/t2;->c:Ld0/e2;

    goto :goto_1

    :cond_7
    instance-of p2, p2, Lj0/d;

    if-eqz p2, :cond_3

    goto :goto_2

    :goto_3
    if-eqz v3, :cond_8

    new-instance v2, Ly3/f;

    invoke-direct {v2, p1}, Ly3/f;-><init>(F)V

    const/4 v4, 0x0

    const/16 v6, 0xc

    move-object v1, p0

    move-object v5, p4

    invoke-static/range {v1 .. v6}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_8
    move-object v1, p0

    move-object v5, p4

    new-instance p0, Ly3/f;

    invoke-direct {p0, p1}, Ly3/f;-><init>(F)V

    invoke-virtual {v1, p0, v5}, Ld0/e;->g(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_9

    return-object p0

    :cond_9
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
