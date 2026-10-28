.class public final synthetic Lgb1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lgb1/a0;->w:J

    iput-wide p3, p0, Lgb1/a0;->x:J

    iput-wide p5, p0, Lgb1/a0;->y:J

    iput-wide p7, p0, Lgb1/a0;->z:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-wide v6, p0, Lgb1/a0;->z:J

    move-object v8, p1

    check-cast v8, Lk2/e;

    iget-wide v0, p0, Lgb1/a0;->w:J

    iget-wide v2, p0, Lgb1/a0;->x:J

    iget-wide v4, p0, Lgb1/a0;->y:J

    invoke-static/range {v0 .. v8}, Lgb1/b0;->c(JJJJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
