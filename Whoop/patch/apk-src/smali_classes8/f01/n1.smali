.class public final synthetic Lf01/n1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lq2/a;

.field public final synthetic x:Z

.field public final synthetic y:Lf01/r1;

.field public final synthetic z:Lf01/p1;


# direct methods
.method public synthetic constructor <init>(Lq2/a;ZLf01/r1;Lf01/p1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf01/n1;->w:Lq2/a;

    iput-boolean p2, p0, Lf01/n1;->x:Z

    iput-object p3, p0, Lf01/n1;->y:Lf01/r1;

    iput-object p4, p0, Lf01/n1;->z:Lf01/p1;

    iput-object p5, p0, Lf01/n1;->E:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lf01/n1;->z:Lf01/p1;

    iget-object v1, p0, Lf01/n1;->E:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lf01/n1;->w:Lq2/a;

    iget-boolean v3, p0, Lf01/n1;->x:Z

    iget-object v4, p0, Lf01/n1;->y:Lf01/r1;

    invoke-static {v2, v3, v4, v0, v1}, Lf01/o1;->h(Lq2/a;ZLf01/r1;Lf01/p1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
