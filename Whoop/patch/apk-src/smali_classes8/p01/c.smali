.class public final synthetic Lp01/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:Lp01/b;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lp01/b;JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp01/c;->w:Lp01/b;

    iput-wide p2, p0, Lp01/c;->x:J

    iput-wide p4, p0, Lp01/c;->y:J

    iput-wide p6, p0, Lp01/c;->z:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-wide v5, p0, Lp01/c;->z:J

    move-object v7, p1

    check-cast v7, Lk2/e;

    iget-object v0, p0, Lp01/c;->w:Lp01/b;

    iget-wide v1, p0, Lp01/c;->x:J

    iget-wide v3, p0, Lp01/c;->y:J

    invoke-static/range {v0 .. v7}, Lp01/f;->f(Lp01/b;JJJLk2/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
