.class public final synthetic Lzq0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic w:Lu2/v;

.field public final synthetic x:Z

.field public final synthetic y:F

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lu2/v;ZFLp1/t2;Lp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq0/g;->w:Lu2/v;

    iput-boolean p2, p0, Lzq0/g;->x:Z

    iput p3, p0, Lzq0/g;->y:F

    iput-object p4, p0, Lzq0/g;->z:Lp1/t2;

    iput-object p5, p0, Lzq0/g;->E:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v4, p0, Lzq0/g;->E:Lp1/t2;

    move-object v5, p1

    check-cast v5, Lh2/b;

    iget-object v0, p0, Lzq0/g;->w:Lu2/v;

    iget-boolean v1, p0, Lzq0/g;->x:Z

    iget v2, p0, Lzq0/g;->y:F

    iget-object v3, p0, Lzq0/g;->z:Lp1/t2;

    invoke-static/range {v0 .. v5}, Lzq0/f$c;->a(Lu2/v;ZFLp1/t2;Lp1/t2;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
