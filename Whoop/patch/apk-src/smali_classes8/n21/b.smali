.class public final synthetic Ln21/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:J


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln21/b;->w:Ljava/util/List;

    iput-wide p2, p0, Ln21/b;->x:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Ll0/v;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Ln21/b;->w:Ljava/util/List;

    iget-wide v1, p0, Ln21/b;->x:J

    invoke-static/range {v0 .. v5}, Ln21/c;->d(Ljava/util/List;JLl0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
