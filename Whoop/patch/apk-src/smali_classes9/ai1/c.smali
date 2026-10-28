.class public final synthetic Lai1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lai1/c;->w:J

    iput-wide p3, p0, Lai1/c;->x:J

    iput-wide p5, p0, Lai1/c;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-wide v4, p0, Lai1/c;->y:J

    move-object v6, p1

    check-cast v6, Ltb/a;

    iget-wide v0, p0, Lai1/c;->w:J

    iget-wide v2, p0, Lai1/c;->x:J

    invoke-static/range {v0 .. v6}, Lai1/d;->h(JJJLtb/a;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
