.class public final synthetic Ld0/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lkotlin/jvm/internal/g0;

.field public final synthetic x:F

.field public final synthetic y:Ld0/h;

.field public final synthetic z:Ld0/m;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;FLd0/h;Ld0/m;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/n1;->w:Lkotlin/jvm/internal/g0;

    iput p2, p0, Ld0/n1;->x:F

    iput-object p3, p0, Ld0/n1;->y:Ld0/h;

    iput-object p4, p0, Ld0/n1;->z:Ld0/m;

    iput-object p5, p0, Ld0/n1;->E:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Ld0/n1;->w:Lkotlin/jvm/internal/g0;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ld0/k;

    iget v3, p0, Ld0/n1;->x:F

    iget-object v4, p0, Ld0/n1;->y:Ld0/h;

    iget-object v5, p0, Ld0/n1;->z:Ld0/m;

    iget-object v6, p0, Ld0/n1;->E:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v6}, Ld0/f;->n(Ld0/k;JFLd0/h;Ld0/m;Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
