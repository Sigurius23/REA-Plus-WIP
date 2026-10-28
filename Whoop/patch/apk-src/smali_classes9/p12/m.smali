.class public final synthetic Lp12/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp12/m;->w:I

    iput-object p2, p0, Lp12/m;->x:Lc93/a;

    iput-object p3, p0, Lp12/m;->y:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lp12/m;->y:Lc93/a;

    check-cast p1, Lh2/b;

    iget v1, p0, Lp12/m;->w:I

    iget-object v2, p0, Lp12/m;->x:Lc93/a;

    invoke-static {v1, v2, v0, p1}, Lp12/l$b;->a(ILc93/a;Lc93/a;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
