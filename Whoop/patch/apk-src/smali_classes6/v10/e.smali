.class public final Lv10/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lv10/g;

.field public G:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/io/Serializable;

.field public y:Lyy/f;

.field public z:Lkotlin/jvm/internal/g0;


# direct methods
.method public constructor <init>(Lv10/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lv10/e;->F:Lv10/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lv10/e;->E:Ljava/lang/Object;

    iget p1, p0, Lv10/e;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv10/e;->G:I

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    iget-object v0, p0, Lv10/e;->F:Lv10/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Lv10/g;->a(Lv10/g;Ly00/c8;Ljava/lang/String;Lyy/f;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
