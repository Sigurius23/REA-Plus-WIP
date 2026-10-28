.class public final synthetic Lm22/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:Lp1/z0;

.field public final synthetic y:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Lp1/z0;Lp1/z0;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lm22/r;->w:F

    iput-object p1, p0, Lm22/r;->x:Lp1/z0;

    iput-object p2, p0, Lm22/r;->y:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm22/r;->y:Lp1/z0;

    check-cast p1, Ld0/e;

    iget v1, p0, Lm22/r;->w:F

    iget-object v2, p0, Lm22/r;->x:Lp1/z0;

    invoke-static {v1, v2, v0, p1}, Lm22/s$a$a;->f(FLp1/z0;Lp1/z0;Ld0/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
