.class public final synthetic Lau0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lau0/d;->w:J

    iput-wide p3, p0, Lau0/d;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-wide v0, p0, Lau0/d;->x:J

    check-cast p1, Ltb/a;

    iget-wide v2, p0, Lau0/d;->w:J

    invoke-static {v2, v3, v0, v1, p1}, Lau0/f;->h(JJLtb/a;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
