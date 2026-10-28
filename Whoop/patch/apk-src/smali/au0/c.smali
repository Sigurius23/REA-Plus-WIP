.class public final synthetic Lau0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lau0/f;

.field public final synthetic x:J

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(Lau0/f;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lau0/c;->w:Lau0/f;

    iput-wide p2, p0, Lau0/c;->x:J

    iput-wide p4, p0, Lau0/c;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-wide v3, p0, Lau0/c;->y:J

    move-object v5, p1

    check-cast v5, Lq83/d;

    iget-object v0, p0, Lau0/c;->w:Lau0/f;

    iget-wide v1, p0, Lau0/c;->x:J

    invoke-static/range {v0 .. v5}, Lau0/f;->g(Lau0/f;JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
