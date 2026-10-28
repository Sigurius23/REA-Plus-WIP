.class public final Leb/w;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lm83/m;

.field public final synthetic w:Lkotlin/jvm/internal/b0;

.field public final synthetic x:Lkotlin/jvm/internal/b0;

.field public final synthetic y:Leb/a0;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/b0;Lkotlin/jvm/internal/b0;Leb/a0;ZLm83/m;)V
    .locals 0

    iput-object p1, p0, Leb/w;->w:Lkotlin/jvm/internal/b0;

    iput-object p2, p0, Leb/w;->x:Lkotlin/jvm/internal/b0;

    iput-object p3, p0, Leb/w;->y:Leb/a0;

    iput-boolean p4, p0, Leb/w;->z:Z

    iput-object p5, p0, Leb/w;->E:Lm83/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Leb/q;

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/w;->w:Lkotlin/jvm/internal/b0;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v0, p0, Leb/w;->x:Lkotlin/jvm/internal/b0;

    iput-boolean v1, v0, Lkotlin/jvm/internal/b0;->w:Z

    iget-boolean v0, p0, Leb/w;->z:Z

    iget-object v1, p0, Leb/w;->E:Lm83/m;

    iget-object v2, p0, Leb/w;->y:Leb/a0;

    invoke-virtual {v2, p1, v0, v1}, Leb/a0;->E(Leb/q;ZLm83/m;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
