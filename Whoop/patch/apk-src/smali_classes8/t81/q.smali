.class public final synthetic Lt81/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/internal/d0;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lc93/m;

.field public final synthetic w:Lt81/b;

.field public final synthetic x:Lu81/d;

.field public final synthetic y:Lu81/b;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lt81/b;Lu81/d;Lu81/b;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt81/q;->w:Lt81/b;

    iput-object p2, p0, Lt81/q;->x:Lu81/d;

    iput-object p3, p0, Lt81/q;->y:Lu81/b;

    iput-wide p4, p0, Lt81/q;->z:J

    iput-object p6, p0, Lt81/q;->E:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lt81/q;->F:Lkotlin/jvm/internal/d0;

    iput-object p8, p0, Lt81/q;->G:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lt81/q;->H:Lc93/m;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-object v0, p0, Lt81/q;->w:Lt81/b;

    iget-object v1, p0, Lt81/q;->x:Lu81/d;

    iget-object v2, p0, Lt81/q;->y:Lu81/b;

    iget-wide v3, p0, Lt81/q;->z:J

    iget-object v5, p0, Lt81/q;->E:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lt81/q;->F:Lkotlin/jvm/internal/d0;

    iget-object v7, p0, Lt81/q;->G:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lt81/q;->H:Lc93/m;

    invoke-static/range {v0 .. v10}, Lt81/l$d;->f(Lt81/b;Lu81/d;Lu81/b;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;Lc93/m;J)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
