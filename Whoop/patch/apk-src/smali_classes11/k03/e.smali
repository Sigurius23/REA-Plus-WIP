.class public final synthetic Lk03/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:J

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk03/e;->w:Ljava/lang/String;

    iput-wide p3, p0, Lk03/e;->x:J

    iput p1, p0, Lk03/e;->y:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v4, p1

    check-cast v4, Lv6/s;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lk03/e;->w:Ljava/lang/String;

    iget-wide v1, p0, Lk03/e;->x:J

    iget v3, p0, Lk03/e;->y:I

    invoke-static/range {v0 .. v6}, Lk03/n;->q(Ljava/lang/String;JILv6/s;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
