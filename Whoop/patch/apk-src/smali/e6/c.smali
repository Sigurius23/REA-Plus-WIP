.class public abstract Le6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/datastore/preferences/protobuf/k0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Landroidx/datastore/preferences/protobuf/u1;->y:Landroidx/datastore/preferences/protobuf/q1;

    sget-object v1, Landroidx/datastore/preferences/protobuf/u1;->E:Landroidx/datastore/preferences/protobuf/s1;

    invoke-static {}, Le6/h;->v()Le6/h;

    move-result-object v2

    new-instance v3, Landroidx/datastore/preferences/protobuf/k0;

    invoke-direct {v3, v0, v1, v2}, Landroidx/datastore/preferences/protobuf/k0;-><init>(Landroidx/datastore/preferences/protobuf/u1;Landroidx/datastore/preferences/protobuf/u1;Le6/h;)V

    sput-object v3, Le6/c;->a:Landroidx/datastore/preferences/protobuf/k0;

    return-void
.end method
